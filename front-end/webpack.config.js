import path from 'path';
import webpack from 'webpack';

export default {
    devtool: 'inline-source-map'
    entry: './src/app.js',
    output: [
        path: path.join(__dirname, 'dist'),
        filename: 'bundle.js',
    ],
    resolve: {
        extensions: ['', '.js', '.jsx']
    },
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
                loader: 'style-loader!css-loader'
            }
        ]
    }
}