import React from 'react';
import { Link } from 'react-router';

const Navbar = React.createClass({
  render() {
    return (
      <div>
        <ul>
          试题库
          <li>
            <ul>
              高中
              <li><Link to="">语文</Link></li>
              <li><Link to="">数学</Link></li>
              <li><Link to="">英语</Link></li>
              <li><Link to="">物理</Link></li>
              <li><Link to="">化学</Link></li>
              <li><Link to="">生物</Link></li>
              <li><Link to="">政治</Link></li>
              <li><Link to="">历史</Link></li>
              <li><Link to="">地理</Link></li>
            </ul>
          </li>
          <li>
            <ul>
              初中
              <li><Link to="">语文</Link></li>
              <li><Link to="">数学</Link></li>
              <li><Link to="">英语</Link></li>
              <li><Link to="">物理</Link></li>
              <li><Link to="">化学</Link></li>
              <li><Link to="">生物</Link></li>
              <li><Link to="">政治</Link></li>
              <li><Link to="">历史</Link></li>
              <li><Link to="">地理</Link></li>
            </ul>
          </li>
        </ul>
        <ul>
        组卷
          <li><Link to="">手动组卷</Link></li>
          <li><Link to="">自动组卷</Link></li>
        </ul>
      </div>
    )
  }
});

export default Navbar;