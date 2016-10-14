import {
    REQUEST,
    RECEIVE_INITIAL_STATE,
    RECEIVE_SELECT,
    RECEIVE_QUESTION,
} from '../actions/actionCreators';
import { combineReducers } from 'redux';
import { routerReducer } from 'react-router-redux';

function isFetching(state = { }, action) {
    switch (action.type) {
        case REQUEST:
            return {
                ...state,
                isFetching: true
            };
        default:
            return state;
    }
};

function selects(state = { }, action) {
    switch (action.type) {
        case RECEIVE_SELECT:
            return {
                ...state,
                selects: action.posts,
                isFetching: false
            };
        default:
            return state;
    }
};

function grades(state = { }, action) {
    switch (action.type) {
        case RECEIVE_INITIAL_STATE:
            return {
                ...state,
                grades: action.posts,
                isFetching: false
            };
        default:
            return state;
    }
};

function questions(state = { }, action) {
    switch (action.type) {
        case RECEIVE_QUESTION:
            return {
                ...state,
                questions: action.posts,
                isFetching: false
            };
        default:
            return state;
    }
};

const rootReducer = combineReducers({isFetching, grades, selects, questions, routing: routerReducer});

export default rootReducer;