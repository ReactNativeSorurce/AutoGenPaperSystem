import React, { Component, PropTypes } from 'react';
import { Link } from 'react-router';
import MenuItem from 'material-ui/MenuItem';

class Course extends Component {
    render() {
        const { course } = this.props;
        return(
                <Link style = {{textDecoration: 'none'}} to={`${course.url}`} ><MenuItem primaryText={ course.context } /></Link>
        )
    }
}

Course.propTypes = {
  course: PropTypes.array.isRequired
};

export default Course;
