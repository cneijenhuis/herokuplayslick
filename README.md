# Example project to show that Play 2.4 with Slick 3.0 doesn't work with Heroku currently

This project was created with:
`activator new herokuplayslick play-scala-intro`

This template already contains a Slick config for H2.

You may have a look at the git history to see what I changed afterwards (basically added Postgres and a Procfile for Heroku).

To deploy on Heroku, install the heroku toolbelt and do

`heroku create`

`git push heroku master`

To follow the deployment and see the error messages, do
`heroku logs --tail`

To check the value of `DATABASE_URL` (see `Procfile`), do
`heroku config`

If you don't want to deploy to Heroku all the time but test locally, you may insert the URL into the `application.conf` as the same error happens then.

I have configured a HirakiCP Test Query, as without it HirakiCP complains:

`Caused by: java.sql.SQLException: JDBC4 Connection.isValid() method not supported, connection test query must be configured`

You may want to disable it in the `application.conf`.
