import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';

import { HomeComponent } from './components/home/home.component';

export const ROUTES: Routes = [
    { path : '', component: HomeComponent} //rota inicial
]

export const routes: ModuleWithProviders = RouterModule.forRoot(ROUTES);