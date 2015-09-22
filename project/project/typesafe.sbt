// Update this when a new patch of Reactive Platform is available
val rpVersion = "15v09p01"

addSbtPlugin("com.typesafe.rp" % "sbt-typesafe-rp" % rpVersion)

val typesafeUrl = "https://repo.typesafe.com/typesafe/for-subscribers-only/AEE4D829FC38A3247F251ED25BA45ADD675D48EB"

resolvers += "typesafe-rp-mvn" at typesafeUrl

resolvers += Resolver.url("typesafe-rp-ivy", url(typesafeUrl))(Resolver.ivyStylePatterns)

resolvers += Resolver.typesafeRepo("releases")



