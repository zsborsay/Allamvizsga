var markerCluster = new MarkerClusterer(globalMap, markers);
google.maps.event.addListener(markerCluster,"clusterclick",
	function (cluster) {
		addClusterInfoWindow(cluster, profession, scope);
	});