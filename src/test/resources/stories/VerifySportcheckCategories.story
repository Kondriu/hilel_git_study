Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify sportchec categories are displayed correctly
Given user is opened Sportcheck main page, using url: 'https://sportchek.ca'
When User click 'shop categories' button
Then next categories should be displayed: 'Deals & Features, Men, Women, Kids, Shoes & Footwear, Gear, Electronics, Jerseys & Fan Wear, Sneaker Launches, Shop by Brand, Chek advice'