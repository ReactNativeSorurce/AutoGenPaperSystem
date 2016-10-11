import React from 'react';
import { Link } from 'react-router';

const Point = React.createClass({
    render() {
        const { point } = this.props;
        const isEmpty = point.details.length === 0;
        return (
            <li>
                {
                    isEmpty
                        ? <Link to={`/view/${point.url}`}>{point.name}</Link>
                        : <ul>
                            <Link to={`/view/${point.url}`}>{point.name}</Link>
                            {point.details.map((detail, i) => <Point point={detail} key={i} i={i}/>)}
                        </ul>
                }
            </li>
        )
    }
});

export default Point;

