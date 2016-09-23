import React from 'react';
import { Link } from 'react-router';

const Main = React.createClass({
    render() {
        return (
          <div>
            <h1>
              <Link to="/">组卷系统</Link>
            </h1>
            {React.cloneElement(this.props.children, this.props)}
          </div>
        )
    }
})

export default Main;