@Test
    public void lookupEmailAddresses() {
        assertThat(new CartoonCharacterEmailLookupService().getResults("looney"), allOf(
            not(empty()),
            containsInAnyOrder(
                allOf(instanceOf(Map.class), hasEntry("id", "56"), hasEntry("email", "roadrunner@fast.org")),
                allOf(instanceOf(Map.class), hasEntry("id", "76"), hasEntry("email", "wiley@acme.com"))
            )
        ));
    }



    @Test
    public void newArrayListsHaveNoElements() {
        assertThat(new ArrayList().size(), is(0));
    }

    @Test
    public void sizeReturnsNumberOfElements() {
        List instance = new ArrayList();
        instance.add(new Object());
        instance.add(new Object());
        assertThat(instance.size(), is(2));
    }

              
