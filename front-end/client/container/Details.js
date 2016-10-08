import React, { PropTypes } from 'react';
import connect from 'react-redux';

import List from '../components/List';
import Point from '../components/Point';
import Question from '../components/Question';

import { getSelect, getQuestion } from '../actions/actionCreators';

const { pathname } = window.location;

const Details = React.createClass({
    PropTypes: {
        posts: PropTypes.object.isRequired,
        dispatch: PropTypes.func.isRequired
    },

    componentDidMount() {
        const { dispatch } = this.props;
        dispatch(getSelect(pathname));
        dispatch(getQuestion(pathname));
    },

    render() {
        const { selects, questions } = this.props;

        var pageNum;
        const id = questions.id;

        if (id === 1) {
            pageNum = <div>
                    [1, 2, 3 ,4 ,5]
                        .map((id) => <Link to={`${pathname}/${id}`}>{id}</Link>);
                    <Link to={`${pathname}/${id + 1}`}>下一页</Link>
                </div>
            ;
        }else if (id === count) {
            pageNum = <div>
                <Link to={`${pathname}/${id - 1}`}>上一页</Link>
                [id - 4, id - 3, id - 2 ,id - 1, id]
                    .map((id) => <Link to={`${pathname}/${id}`}>{id}</Link>);
            </div>
            ;
        }else {
            pageNum = <div>
                <Link to={`${pathname}/${id - 1}`}>上一页</Link>
                [id, id + 1, id +2, id + 3, id + 4]
                .map((id) => <Link to={`${pathname}/${id}`}>{id}</Link>);
                <Link to={`${pathname}/${id + 1}`}>下一页</Link>
            </div>
            ;
        }

        return (
            <div>
                <div>
                    <p>全部知识点</p>
                    { selects.points.map((point, i) => <Point point={point} key={i} i={i} />)}
                </div>
                <div>
                    <div>
                        <span>题型</span>
                        { selects.types.map((tyqe, i) => <List type={type} key={i} i={i} />)}
                    </div>
                    <div>
                        <span>难度系数</span>
                        { selects.diffs.map((diff, i) => <List type={diff} key={i} i={i} />)}
                    </div>
                    <div>
                        <span>题目特点</span>
                        { selects.features.map((feature, i) => <List type={feature} key={i} i={i} />)}
                    </div>
                </div>
                <div>
                    {questions.contextLists.map((contextList, i) => <Question contextList={contextList} key={i} i={i} />)}
                    { pageNum }
                </div>
            </div>
      )
  }
});

const mapStatetoProps = state => {
    const { selects, questions } = state || {
        selects: {},
        questions: {}
    };

    return { selects, questions }
};


export default connect(mapStatetoProps)(Details);