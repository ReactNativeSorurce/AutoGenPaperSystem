import React from 'react';

const Question = React.createClass({
    render() {
        const { contextList } = this.props;
        return (
            <div>
                <div>{contextList.id}.{contextList.context}</div>
                <p>{contextList.answer}</p>
            </div>
        )
    }
});

export default Question;
