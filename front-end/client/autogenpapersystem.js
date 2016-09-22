import React from 'react';
import { render } from 'react-dom';

//import components
import Main from './components/Main'

//import react-router
import { Router, Route, IndexRoute, browserHistory } from 'react-router';

const router = (
    <Router history={ browserHistory }>
        <Route path="/" component={Main} />
    </Router>
);

render(router, document.getElementById('root'));