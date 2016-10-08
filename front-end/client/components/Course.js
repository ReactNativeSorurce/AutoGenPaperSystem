import React from 'react';
import { Link } from 'react-router';

const Course = React.createElement({
    render() {
        const { course } = this.props;
        return(
                <Link to={`${course.url}`}>{ course.context }</Link>
        )
    }
})

export default Course;
