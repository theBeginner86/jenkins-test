def buildFunc() {
  echo "building... ${params.VERSION}"
  node --version
}

def testFunc() {
  echo "testing... ${params.VERSION}"
}

def deployFunc() {
  echo "deploying... ${params.VERSION}"
}

return this
