package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RELEASE_NOTES;
import org.kyojo.schemaOrg.m3n3.core.Container.ReleaseNotes;

@ExternalDomain
public class ReleaseNotesConverter implements DomainConverter<ReleaseNotes, String> {

	@Override
	public String fromDomainToValue(ReleaseNotes domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReleaseNotes fromValueToDomain(String value) {
		return new RELEASE_NOTES(value);
	}

}
