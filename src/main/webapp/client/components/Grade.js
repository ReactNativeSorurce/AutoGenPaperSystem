import React from 'react';

import Course from './Course'

const Grade = React.createClass({
    render() {
        const { grade } = this.props;
        return(
            <div>
                <p>{ grade.name }</p>
                { grade.courses.map((course, i) => <Course course={ course } key={i} i={i} />)}
            </div>
        )
    }
})

export default Grade;