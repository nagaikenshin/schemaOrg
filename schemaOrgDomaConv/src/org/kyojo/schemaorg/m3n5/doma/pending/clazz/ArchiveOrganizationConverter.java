package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.ARCHIVE_ORGANIZATION;
import org.kyojo.schemaorg.m3n5.pending.Clazz.ArchiveOrganization;

@ExternalDomain
public class ArchiveOrganizationConverter implements DomainConverter<ArchiveOrganization, String> {

	@Override
	public String fromDomainToValue(ArchiveOrganization domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArchiveOrganization fromValueToDomain(String value) {
		return new ARCHIVE_ORGANIZATION(value);
	}

}
