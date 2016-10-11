import React from 'react';
import { Link } from 'react-router';
import {List, ListItem} from 'material-ui/List';
import ContentInbox from 'material-ui/svg-icons/content/inbox';


const Point = React.createClass({
    render() {
        const { point, i } = this.props;
        const I = i + 1;
        const isEmpty = point.details.length === 0;
        return (
            <div>
            {
                isEmpty
                    ? <ListItem key = { I } nestedLevel={ point.level }>
                        <Link
                            to={`/view/${point.url}`}
                            style = {{textDecoration: 'none', color: '#1E88E5'}}>
                            {point.name}
                        </Link>
                    </ListItem>
                    : <ListItem
                        nestedLevel={ point.level }
                        key = { I }
                        initiallyOpen={false}
                        primaryTogglesNestedList={false}
                        nestedItems =
                        {point.details.map((detail, i) =>
                            <Point point={detail} key={i} i={i}/>)}
                    >
                        <Link
                            to={`/view/${point.url}`}
                            style = {{textDecoration: 'none', color: '#1E88E5'}}>
                            {point.name}
                        </Link>
                    </ListItem>
            }
            </div>
        )
    }
});

export default Point;

