var path = require('path');
var webpack = require('webpack');

module.exports = {
    devtool: 'source-map',
    entry: [
        'webpack-hot-middleware/client',
        './client/autogenpapersystem'
    ],
    output: {
        path: path.join(__dirname, 'dist'),
        filename: 'bundle.js',
        publicPath: '/static/'
    },
    plugins: [
        new webpack.HotModuleReplacementPlugin(),
        new webpack.NoErrorsPlugin()
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
};