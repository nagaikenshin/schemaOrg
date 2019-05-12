package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.PROJECT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Project;

@ExternalDomain
public class ProjectConverter implements DomainConverter<Project, String> {

	@Override
	public String fromDomainToValue(Project domain) {
		return domain.getNativeValue();
	}

	@Override
	public Project fromValueToDomain(String value) {
		return new PROJECT(value);
	}

}
