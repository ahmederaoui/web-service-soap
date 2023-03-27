# web-service-soap
web service en utilisant le protocol SOAP

Les Web Services sont des composants web basés sur Internet (HTTP ) qui exécutent des tâches
précises et qui respectent un format spécifique (XML).
Ils permettent aux applications de faire appel à des fonctionnalités à distance en simplifiant ainsi
l’échange de données.
Les Web Services permettent aux applications de dialoguer à travers le réseau, indépendamment de
• leur plate-forme d’exécution
• et de leur langage d'implémentation.
Ils s’inscrivent dans la continuité d'initiatives telles que
• CORBA (Common Object Request Broker Architecture, de l'OMG) en apportant toutefois une
réponse plus simple, s’appuyant sur des technologies et standards reconnus et maintenant
acceptés de tous.


Le concept des Web Services s’articule actuellement autour des trois
concepts suivants :
# SOAP (Simple Object Access Protocol)
• est un protocole d'échange inter-applications indépendant de toute plate-forme,
basé sur le langage XML.
• Un appel de service SOAP est un flux ASCII encadré dans des balises XML et
transporté dans le protocole HTTP.

# WSDL (Web Services Description Language)
• donne la description au format XML des Web Services en précisant les méthodes
pouvant être invoquées, leurs signatures et le point d’accès (URL, port, etc..).
• C’est, en quelque sorte, l’équivalent du langage IDL pour la programmation
distribuée CORBA.

# UDDI (Universal Description, Discovery and Integration)
• normalise une solution d’annuaire distribué de Web Services, permettant à la fois la
publication et l'exploration (recherche) de Web Services.
• UDDI se comporte lui-même comme un Web service dont les méthodes sont
appelées via le protocole SOAP.
