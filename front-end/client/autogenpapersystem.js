import React from 'react';
import { render } from 'react-dom';

//import css
import css from './styles/style.css';

//import components
import Main from './components/Main';
import Navbar from './components/Navbar'

//import react-router
import { Router, Route, IndexRoute, browserHistory } from 'react-router';

const router = (
    <Router history={ browserHistory }>
        <Route path="/" component={Main}>
          <IndexRoute component={Navbar} />
        </Route>
    </Router>
);

render(router, document.getElementById('root'));