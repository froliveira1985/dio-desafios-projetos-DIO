import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople():Observable<any> {
    let peopleArray = [
      {
        firstName: 'Fábio',
        lastName: 'Oliveira',
        age: 36
      },
      {
        firstName: 'Karina',
        lastName: 'Oliveira',
        age: 28
      },
      {
        firstName: 'Joao',
        lastName: 'Pereira',
        age: 32
      },
      {
        firstName: 'Marcio',
        lastName: 'Santos',
        age: 40
      },
    ]

    return of(peopleArray)
  }
}