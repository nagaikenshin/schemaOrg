package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ORGANIZER;
import org.kyojo.schemaorg.m3n5.core.Container.Organizer;

@ExternalDomain
public class OrganizerConverter implements DomainConverter<Organizer, String> {

	@Override
	public String fromDomainToValue(Organizer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Organizer fromValueToDomain(String value) {
		return new ORGANIZER(value);
	}

}
