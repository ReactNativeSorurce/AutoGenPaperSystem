import {
    REQUEST,
    RECEIVE_INITIAL_STATE,
    RECEIVE_SELECT,
    RECEIVE_QUESTION,
} from '../actions/actionCreators'

function rootreducer(state = { }, action) {
    switch (action.type) {
        case REQUEST:
            return {
                ...state,
                isFetching: true
            };
        case RECEIVE_INITIAL_STATE:
            return {
                ...state,
                grades: action.posts
            };
        case RECEIVE_SELECT:
            return {
                ...state,
                selects: action.posts
            };
        case RECEIVE_QUESTION:
            return {
                ...state,
                questions: action.posts
            };
        default:
            return state;
    }
}

export default rootreducer;