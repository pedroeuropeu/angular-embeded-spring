import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { pathValues } from '../utils/path-values';

@Injectable({
    providedIn: 'root',
})
export class MainService {

    constructor(private http: HttpClient) {}


    ping() {
        const params = { 
        };
        return this.http.get(pathValues.ping, {
            params: params, responseType: 'text'
        });
    }
}
