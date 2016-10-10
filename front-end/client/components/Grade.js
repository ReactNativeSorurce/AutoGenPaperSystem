import React from 'react';
import DropDownMenu from 'material-ui/DropDownMenu';
import MenuItem from 'material-ui/MenuItem';

import Course from './Course'

const Grade = React.createClass({
    render() {
        const { grade } = this.props;
        return(
            <MenuItem
              style = {{lineHeight: '56px'}}
              primaryText = { grade.name }
              menuItems =
              { grade.courses.map((course, i) =>
                <Course course={ course } key={i} i={i} />)}
            />
        )
    }
})

export default Grade;