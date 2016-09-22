var path = require('path');
var webpack = require('webpack');

module.exports = {
    devtool: 'source-map',
    entry: [
        './client/autogenpapersystem'
    ],
    output: {
        path: path.join(__dirname, 'dist'),
        filename: 'bundle.js',
        publicPath: '/static/'
    },
    plugins: [
        new webpack.optimize.OccurenceOrderPlugin(),
        new webpack.DefinePlugin({
            'process.env': {
                'NODE_ENV': "'production'"
            }
        }),
        new webpack.optimize.UglifyJsPlugin({
            compressor: {
                warnings: false
            }
        })
    ],
    module: {
        loaders: [
            //js
            {
                test: /\.js$/,
                loader: 'babel',
                include: path.join(__dirname, 'client')
            },
            //css
            {
                test: /\.css$/,
                loader: 'style-loader!css-loader',
                include: path.join(__dirname, 'client')
            }
        ]
    }
}