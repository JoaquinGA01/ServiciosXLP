FROM nginx
add proxy/proxy.conf /etc/nginx/conf.d/default.conf
add proxy/index.html /etc/nginx/html/index.html
CMD sed -i -e 's/80/'"80"'/g' /etc/nginx/conf.d/default.conf && nginx -g 'daemon off;'