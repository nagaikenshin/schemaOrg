package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PERSON;
import org.kyojo.schemaorg.m3n5.core.Clazz.Person;

@ExternalDomain
public class PersonConverter implements DomainConverter<Person, String> {

	@Override
	public String fromDomainToValue(Person domain) {
		return domain.getNativeValue();
	}

	@Override
	public Person fromValueToDomain(String value) {
		return new PERSON(value);
	}

}
