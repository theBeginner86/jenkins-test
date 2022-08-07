def buildFunc() {
  echo "building... ${params.VERSION}"
}

def testFunc() {
  echo "testing... ${params.VERSION}"
}

def deployFunc() {
  echo "deploying... ${params.VERSION}"
}

return this