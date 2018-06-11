var deferred = $q.defer();
var req = {
    method: 'GET',
    url: '/api/admin/users/quantity?search=' + search,
    contentType: "application/json",
};
$http(req).then(function (response) {
    deferred.resolve(response);
}, function (response) {
    deferred.reject(response);
});
return deferred.promise;