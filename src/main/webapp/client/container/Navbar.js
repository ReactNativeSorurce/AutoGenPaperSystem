import React, { PropTypes } from 'react';
import { connect } from 'react-redux';

import Grade from '../components/Grade';

import { getInitialState } from '../actions/actionCreators';

const Navbar = React.createClass({

    componentDidMount() {
        const { dispatch } = this.props;
        dispatch(getInitialState());
    },

    render() {
        const { grades } = this.props;
        return (
            <div>
                <h1>questionBank</h1>
                <div>
                    { grades.map((grade, i) => <Grade grade={grade} key={i} i={i}/>)}
                </div>
                { this.props.children }
            </div>
        )
    }
});

const mapStateToProps = state => ({
    grades: state.grades
});

export default connect(mapStateToProps)(Navbar);