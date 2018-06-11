$urlRouterProvider.otherwise('/home');

$stateProvider.state('home', {
    url: '/home',
    templateUrl: 'google-map.html',
    controller: 'GoogleMapController as googleMapController',
    data: {
        permissions: {
            only: ["ROLE_USER", "ROLE_ADMIN", "unauthorized"]
        }
    }
});