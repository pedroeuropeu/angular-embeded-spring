import { Component } from '@angular/core';
import { MainService } from './services/transaction-account.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'AppName-UI';

  constructor(public mainService: MainService) {
    this.testeApi();
}

  testeApi(){
    this.mainService.ping().subscribe(response => {
       this.title = response;
    });
}


}
