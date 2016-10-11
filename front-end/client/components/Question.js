import React from 'react';
import {Card, CardActions, CardHeader, CardMedia, CardTitle, CardText} from 'material-ui/Card';

const Question = React.createClass({
    render() {
        const { contextList } = this.props;
        return (
            <Card style={{margin: '10px'}}>
                <CardTitle title = {contextList.id }/>
                <CardText>
                  {contextList.context}
                </CardText>
                <CardText>{contextList.answer}</CardText>
            </Card>
        )
    }
});

export default Question;
