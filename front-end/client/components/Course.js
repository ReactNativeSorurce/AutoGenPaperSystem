import React from 'react';
import { Link } from 'react-router';
import MenuItem from 'material-ui/MenuItem';

const Course = React.createClass({
    render() {
        const { course } = this.props;
        return(
                <Link style = {{textDecoration: 'none'}} to={`${course.url}`} ><MenuItem primaryText={ course.context } /></Link>
        )
    }
})

export default Course;
