# Example project to show that Play 2.4 with Slick 3.0 does work with Heroku

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
