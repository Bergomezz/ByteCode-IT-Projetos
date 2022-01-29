/// <reference types="cypress"/>

describe('test of login in the saucedemo page', () => {

    before(() => {
        cy.visit('/')
    })

    it('first test with success case', () => {
        cy.login('standard_user', 'secret_sauce')
    })

})