import React, { PropTypes } from 'react';
import { connect } from 'react-redux';

import Grade from '../components/Grade';

import { getInitialState } from '../actions/actionCreators';

const Navbar = React.createClass({
    PropTypes: {
        posts: PropTypes.object.isRequired,
        dispatch: PropTypes.func.isRequired
    },

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

const mapStatetoProps = state => {
    const { grades } = state || {
        grades: []
    };

    return { grades }
};

export default connect(mapStatetoProps)(Navbar);