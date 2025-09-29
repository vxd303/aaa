package com.audiomack.gradle

class DexguardStubVariant {
    final String name
    final List<String> defaultConfigurations = []
    final List<String> configurations = []
    final List<String> consumerRuleFilters = []

    DexguardStubVariant(String name) {
        this.name = name
    }

    void defaultConfiguration(String value) {
        defaultConfigurations.add(value)
    }

    void configuration(String value) {
        configurations.add(value)
    }

    void consumerRuleFilter(String value) {
        consumerRuleFilters.add(value)
    }
}
