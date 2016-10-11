import React from 'react';
import { Link } from 'react-router';

const Course = React.createClass({
    render() {
        const { course } = this.props;
        return(
                <Link to={`/view/${course.url}`}>{ course.context }</Link>
        )
    }
})

export default Course;
