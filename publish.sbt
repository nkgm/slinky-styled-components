publishMavenStyle in ThisBuild := true

pomIncludeRepository in ThisBuild := { _ => false }

publishArtifact in Test in ThisBuild := false

publishTo in ThisBuild := Some(Opts.resolver.sonatypeStaging)

pomExtra in ThisBuild :=
  <url>https://github.com/shadaj/slinky-styled-components</url>
    <licenses>
      <license>
        <name>MIT</name>
        <url>https://opensource.org/licenses/MIT</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>https://github.com/shadaj/slinky-styled-components.git</url>
      <connection>https://github.com/shadaj/slinky-styled-components.git</connection>
    </scm>
    <developers>
      <developer>
        <id>shadaj</id>
        <name>Shadaj Laddad</name>
        <url>http://shadaj.me</url>
      </developer>
    </developers>
