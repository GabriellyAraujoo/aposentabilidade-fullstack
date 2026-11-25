import { Component, signal, inject } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';

interface Avaliacao {
  id: number;
  idade: number;
  podeAposentar: boolean;
}

@Component({
  imports: [RouterOutlet],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  private readonly http = inject(HttpClient);

  protected readonly title = signal('Aposentabilidade');
  protected readonly autora = signal('Gabrielly Araújo');
  protected readonly avaliacoes = signal<Avaliacao[]>([]);

  constructor() {
    this.http.get<Avaliacao[]>('http://localhost:8080/api/avaliacoes')
      .subscribe(lista => this.avaliacoes.set(lista));
  }
avaliar(valor: string) {
    const idade = Number(valor);
    this.http.post<Avaliacao>(`http://localhost:8080/api/avaliacoes?idade=`+ idade, null)
      .subscribe(nova => this.avaliacoes.update(lista => [...lista, nova]));
  }
  }

