import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { routes } from './app.routes';
import { UserService } from './services/user.service';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { DialogService } from './dialog.service';
import { MenuComponent } from './components/menu/menu.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    routes
  ],
  providers: [
    UserService, 
    DialogService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
