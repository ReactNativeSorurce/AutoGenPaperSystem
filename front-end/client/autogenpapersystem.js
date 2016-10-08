import React from 'react';
import { render } from 'react-dom';
import { Provider } from 'react-redux';
import { Router, Route, browserHistory } from 'react-router';
import { syncHistoryWithStore } from 'react-router-redux';

//import components
import Navbar from './container/Navbar';
import Details from './container/Details';

import store from './store';

const history = syncHistoryWithStore(browserHistory, store)

const router = (
  <Provider store={ store }>
    <Router history={history}>
      <Route path="/" component={Navbar}>
        <Route path="/*" components={Details} />
      </Route>
    </Router>
  </Provider>
);

render(router, document.getElementById('root'));