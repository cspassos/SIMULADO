import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';

import { HomeComponent } from './components/home/home.component';
import { UserNewComponent } from './components/user-new/user-new.component';
import { UserListComponent } from './components/user-list/user-list.component';

export const ROUTES: Routes = [
    { path : '', component: HomeComponent}, //rota inicial
    { path : 'user-new', component: UserNewComponent},
    { path : 'user-new/:id', component: UserNewComponent},
    { path : 'user-list', component: UserListComponent},
]

export const routes: ModuleWithProviders = RouterModule.forRoot(ROUTES);