import React from 'react';
import { Link } from 'react-router';

const Point = React.createClass({
    render() {
        const { point } = this.props;
        const isEmpty = point.details.length === 0;
        return (
            <ul>
                {
                    isEmpty
                        ? <li><Link to={`${point.url}`}>{point.name}</Link></li>
                        : <li>
                        <ul>
                            <Link to={`${point.url}`}>{point.name}</Link>
                            {point.details.map((detail, i) => <Point point={detail} key={i} i={i}/>)}
                        </ul>
                    </li>
                }
            </ul>
        )
    }
});

export default Point;

