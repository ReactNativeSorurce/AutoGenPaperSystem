import React, { Component, PropTypes } from 'react';
import { connect } from 'react-redux';
import lightBaseTheme from 'material-ui/styles/baseThemes/lightBaseTheme';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import getMuiTheme from 'material-ui/styles/getMuiTheme';
import {Toolbar, ToolbarGroup, ToolbarSeparator, ToolbarTitle} from 'material-ui/Toolbar';
import MenuItem from 'material-ui/MenuItem';

import Grade from '../components/Grade';

import { getInitialState } from '../actions/actionCreators';

class Navbar extends Component{
    componentWillMount() {
        const { dispatch } = this.props;
        alert('haha');
        dispatch(getInitialState());
    };

    render() {
        const { grades } = this.props;
        return (
            <MuiThemeProvider muiTheme={getMuiTheme(lightBaseTheme)}>
                <div>
                    <Toolbar style={{backgroundColor: "#1565C0"}}>
                        <ToolbarGroup>
                            <ToolbarTitle text="题库" style={{color: '#FFFFFF'}}/>
                                <MenuItem
                                    style = {{lineHeight: '56px', color: '#FFFFFF'}}
                                    primaryText = '试题库'
                                    menuItems =
                                    { grades.map((grade, i) =>
                                        <Grade grade={grade} key={i} i={i}/>)
                                    }
                                />
                        </ToolbarGroup>
                    </Toolbar>
                    { this.props.children }
                </div>
            </MuiThemeProvider>
        )
    }
};

Navbar.propTypes = {
  dispatch: PropTypes.func.isRequired
};

const mapStateToProps = state => ({
    grades: state.grades
});

export default connect(mapStateToProps)(Navbar);