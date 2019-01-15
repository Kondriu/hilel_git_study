Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: verify user is able to translate a custom word, using diffenent languages
Given open site 'https://translate.google.com/'
When user choose following language '<sourceLanguage>' as source
And user choose following language '<targetLanguage>' as target
And user type word '<inputWord>'
Then user should see next translated word '<translatedResult>'

Examples:
| sourceLanguage | targetLanguage   | inputWord     | translatedResult  |
| Spanish        | English          | hola         | Hello             |
| English        | Spanish          | hello         | Hola             |