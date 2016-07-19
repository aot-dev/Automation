Feature: Cricket update

  Scenario: Cricket world updates
    	Given I visit cricbuzz website
	Then I check schedules for different tournaments
    	Then I check rankings for "batsmens"
    	Then I check rankings for "bowlers"
	Then I check live score of matches
	Then I check different news of cricket
	Then I check updates for few popular teams